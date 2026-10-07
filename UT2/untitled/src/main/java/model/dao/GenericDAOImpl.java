package model.dao;

import connection.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class GenericDAOImpl<T, ID> implements GenericDAO<T, ID> {
    private final Class<T> clazz;

    public GenericDAOImpl(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void save(T entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new Exception("Error al guardar la entidad: " + e.getMessage(), e);
        } finally {
            session.close();
        }
    }

    @Override
    public void create(T entity) throws Exception {
        save(entity);
    }

    @Override
    public T findById(ID id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(clazz, id);
        }
    }

    @Override
    public List<T> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM " + clazz.getSimpleName(), clazz).list();
        }
    }

    @Override
    public void update(T entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new Exception("Error al actualizar la entidad: " + e.getMessage(), e);
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(T entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new Exception("Error al eliminar la entidad: " + e.getMessage(), e);
        } finally {
            session.close();
        }
    }
}

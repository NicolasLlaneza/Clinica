package Orm;

import modelo.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import persistencia.HibernateUtil;


public class Main {
    public static void main (String[]args){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx =session.beginTransaction();

        Especialidad especialidad = new Especialidad();
        especialidad.setDenominacion("Cardiologia");
        session.persist(especialidad);

        Medico medico =new Medico();
        medico.setNombre("Juan");
        medico.setApellido("Perez");
        medico.setDNI(22456789);
        medico.setMatricula(12332394);
        medico.setCelular(261634433);
        medico.setEspecialidad(especialidad);
        session.persist(medico);

        tx.commit();
        session.close();
    }
}
package persistencia;

import modelo.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration config = new Configuration();

            //Conexión

            config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/clinica");
            config.setProperty("hibernate.connection.username", "root");
            config.setProperty("hibernate.connection.password", "tu_contraseña");

            //Hibernate

            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            config.setProperty("hibernate.hbm2ddl.auto", "update");
            config.setProperty("hibernate.show_sql", "true");

            //Clases

            config.addAnnotatedClass(Persona.class);
            config.addAnnotatedClass(Medico.class);
            config.addAnnotatedClass(Empleado.class);
            config.addAnnotatedClass(Paciente.class);
            config.addAnnotatedClass(Domicilio.class);
            config.addAnnotatedClass(Especialidad.class);
            config.addAnnotatedClass(HistoriaClinica.class);
            config.addAnnotatedClass(DetalleHistoriaClinica.class);
            config.addAnnotatedClass(Turno.class);

            sessionFactory = config.buildSessionFactory();

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError("Error al crear Session Factory" + ex);
        }


    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}

package ejercicios;

/**
 *
 * @author Uniminuto Tibu
 */
public class Ejercicio_5 {
    public interface IOAD {

        void Insert(Object entity);

        void Update(Object id, Object entity);

        void Delete(Object id);
    }

    public interface lectura {

        Object[] GetAll();

        Object GetById(Object id);
    }

    public abstract class FacturaOadDatosReadOnly implements lectura {

        public Object[] GetAll() {
            // Obtener todas las facturas
            return null;
        }

        public Object GetById(Object id) {
            // Obtener factura por ID
            return null;
        }
    }
}

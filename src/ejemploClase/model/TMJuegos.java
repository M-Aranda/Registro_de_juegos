package ejemploClase.model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author maranda
 */
public class TMJuegos implements TableModel {

    private List<Juego> lista;

    public TMJuegos(List<Juego> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Consola";
            case 3:
                return "Estado";
            case 4:
                return "Precio";
            case 5:
                return "Stock";
            case 6:
                return "Categoría";
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Consola.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return Integer.class;
            case 6:
                return List.class;
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Juego j = lista.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return j.getId();
            case 1:
                return j.getNombre();
            case 2:
                return j.getConsola();
            case 3:
                return j.getEstado();
            case 4:
                return j.getPrecio();
            case 5:
                return j.getStock();
            case 6:
                return j.getCategorias();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // modificar la lista BD
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }

}

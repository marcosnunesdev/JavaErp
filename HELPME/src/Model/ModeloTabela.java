package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

    private static final String[] colunas = { "cpf", "nome", "codigo" };

    private ArrayList<Cliente> clientes;

    public ModeloTabela(ArrayList<Cliente> clientes) {
        super();
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getCpf();  // Ajuste aqui
            case 1:
                return cliente.getNome();
            case 2:
                return cliente.getCodigo();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];  // Ajuste aqui
    }
}

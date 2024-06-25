package dao;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
    private List<Paciente> pacientes = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    // Outros métodos de CRUD (Create, Read, Update, Delete)
}

package service;

import model.Paciente;
import model.Medico;
import model.Consulta;
import dao.PacienteDAO;
import java.util.List;

public class PostoSaudeService {
    private PacienteDAO pacienteDAO = new PacienteDAO();
    // Similares DAOs para Medico e Consulta

    public void cadastrarPaciente(Paciente paciente) {
        pacienteDAO.adicionarPaciente(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacienteDAO.listarPacientes();
    }

    // Métodos para cadastrar médicos, agendar consultas, etc.
}

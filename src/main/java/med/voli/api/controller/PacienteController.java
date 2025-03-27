package med.voli.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voli.api.paciente.PacienteRepository;
import med.voli.api.medico.DadosListagemMedico;
import med.voli.api.paciente.DadosCadastroPaciente;
import med.voli.api.paciente.DadosListagemPaciente;
import med.voli.api.paciente.Paciente;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        pacienteRepository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort= {"nome"}) Pageable paginacao) {
        return pacienteRepository.findAll(paginacao).map(DadosListagemPaciente::new);
    }

}
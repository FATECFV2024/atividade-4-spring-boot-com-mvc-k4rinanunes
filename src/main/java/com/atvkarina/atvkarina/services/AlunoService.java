package com.atvkarina.atvkarina.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atvkarina.atvkarina.entities.Aluno;
import com.atvkarina.atvkarina.repositories.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepository;
   
   
   
    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }


    public Aluno findById(Long id){
        Optional<Aluno> obj = alunoRepository.findById(id);
        return obj.orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado"));
    }

    public Aluno createAluno(Aluno aluno){
        return alunoRepository.save(aluno); 
    }

    public Aluno updateAluno(Long id, Aluno aluno){
        Aluno obj = findById(id);
        obj.setAluno(aluno.getAluno());
        obj.setCurso(aluno.getCurso());
        obj.setIdade(aluno.getIdade());
        obj.setMatriculado(aluno.getMatriculado());
        return alunoRepository.save(obj);
    }

    public void deleteAluno(Long id){
        Aluno obj = findById(id);
        alunoRepository.delete(obj);
    }


}

package com.atvkarina.atvkarina.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.atvkarina.atvkarina.entities.Aluno;
import com.atvkarina.atvkarina.repositories.AlunoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {



    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void run(String... args) throws Exception {

        Aluno aluno1 = new Aluno(null, "Karina", "ADS", 20 , true);
        Aluno aluno2 = new Aluno(null, "Jose", "ADS", 25 , true);

        //Manda para o banco de dados
        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2));


    }
}
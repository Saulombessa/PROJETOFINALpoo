import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setNomeConteudo("JAVA dio");
        curso1.setDescricaoConteudo("Iniciando no JAVA");
        curso1.setCargaHoraria(5);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setNomeConteudo("JAVA dio Poo");
        curso2.setDescricaoConteudo("Aprendendo POO com JAVA");
        curso2.setCargaHoraria(8);
        //System.out.println(curso2);

        Curso curso3 = new Curso();
        curso3.setNomeConteudo("Projeto JAVA dio");
        curso3.setDescricaoConteudo("Fazendo um projeto de Bootcamp");
        curso3.setCargaHoraria(5);
        //System.out.println(curso3);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setNomeConteudo("LIVE JAVA");
        mentoria1.setDescricaoConteudo("Live sobre JAVA");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);

        BootCamp bootcampdio = new BootCamp();
        bootcampdio.setNomeBootCamp("Potência Tech powered by iFood - Java Beginners");
        bootcampdio.setDescricaoBootCamp("Bootcamp para aprender java na plataforma DIO");
        bootcampdio.getConteudos().add(curso1);
        bootcampdio.getConteudos().add(curso2);
        bootcampdio.getConteudos().add(curso3);
        bootcampdio.getConteudos().add(mentoria1);

        Dev sauloDev = new Dev();
        sauloDev.setNome("SAULO");
        sauloDev.inscreverBootcamp(bootcampdio);
        System.out.println("Conteudos inscritos pelo " + sauloDev +": " + sauloDev.getConteudosIncritos());
        sauloDev.progredir();
        sauloDev.progredir();
        sauloDev.progredir();
        sauloDev.progredir();
        System.out.println("--------------------------------------------------");
        System.out.println("Conteudos inscritos pelo aluno" + sauloDev +": " + sauloDev.getConteudosIncritos());
        System.out.println("Conteudos concluidos pelo aluno" + sauloDev +": " + sauloDev.getConteudosConcluidos());
        System.out.println("XP TOTAL: " + sauloDev.calcularTotalXp());


    }
}

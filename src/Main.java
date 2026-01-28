import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descricao curso python");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descriacao Mantoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Deleloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marcelo:"+ devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();

        System.out.println("Conteudos Inscritos Marcelo:"+ devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Marcelo:"+ devMarcelo.getConteudosConcluidos());
        System.out.println("----------------------------------------------------------------");

        Dev devAugusto = new Dev();
        devAugusto.setNome("Augusto");
        devAugusto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Augusto:"+ devAugusto.getConteudosInscritos());
        devAugusto.progredir();

        System.out.println("Conteudos Inscritos Augusto:"+ devAugusto.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Augusto:"+ devAugusto.getConteudosConcluidos());
    }
}
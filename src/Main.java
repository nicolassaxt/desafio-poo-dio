import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de "+devNicolas.getNome()+":"+ devNicolas.getConteudosInscritos());
        devNicolas.progredir();
        devNicolas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+devNicolas.getNome()+":"+ devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+devNicolas.getNome()+":"+ devNicolas.getConteudosConluidos());
        System.out.println("XP:" + devNicolas.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+devJoao.getNome()+":"+  devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+devJoao.getNome()+":"+  devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos "+devJoao.getNome()+":"+  devJoao.getConteudosConluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}

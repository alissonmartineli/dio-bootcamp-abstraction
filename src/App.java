import java.time.LocalDate;

import com.github.alissonmartineli.bootcamp.domain.Bootcamp;
import com.github.alissonmartineli.bootcamp.domain.Course;
import com.github.alissonmartineli.bootcamp.domain.Mentorship;
import com.github.alissonmartineli.bootcamp.domain.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course();
        course1.setTitle("curso java");
        course1.setDescription("descrição curso java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("curso js");
        course2.setDescription("descrição curso js");
        course2.setWorkload(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("mentoria de java");
        mentorship.setDescription("descrição mentoria java");
        mentorship.setDate(LocalDate.now());

        /*
         * System.out.println(course1);
         * System.out.println(course2);
         * System.out.println(mentorship);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Student student1 = new Student();
        student1.setName("Maria");
        student1.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + student1.getSubscribedContent());
        student1.progress();
        student1.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + student1.getSubscribedContent());
        System.out.println("Conteúdos Concluídos Maria:" + student1.getCompletedContents());
        System.out.println("XP:" + student1.calculateTotalXP());

        System.out.println("-------");

        Student student2 = new Student();
        student2.setName("João");
        student2.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + student2.getSubscribedContent());
        student2.progress();
        student2.progress();
        student2.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + student2.getSubscribedContent());
        System.out.println("Conteúdos Concluídos João:" + student2.getCompletedContents());
        System.out.println("XP:" + student2.calculateTotalXP());
    }
}

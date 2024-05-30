public class ProyectoClaseTest {
    public static void main(String[] args) {
        ProyectoClase project1 = new  ProyectoClase("Project1", "Description1");
        System.out.println(project1.elevatorPitch());

        ProyectoClase project2 = new  ProyectoClase("Project2");
        project2.setDescription("Description2");
        System.out.println(project2.elevatorPitch());

        ProyectoClase project3 = new  ProyectoClase();
        project3.setName("Project3");
        project3.setDescription("Description3");
        System.out.println(project3.elevatorPitch());
    }
    @Test
    void testProject() {
        Project project = new Project("Tesla Model S", 60000);

        assertEquals("Tesla Model S", project.getName());
        assertEquals(60000, project.getCost());
    }
}
}



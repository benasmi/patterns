package com.kaboomb.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        StudentColleague student1 = new StudentColleague("Student1", mediator);
        StudentColleague student2 = new StudentColleague("Student2", mediator);

        TeacherColleague teacher1 = new TeacherColleague("Teacher1", mediator);
        TeacherColleague teacher2 = new TeacherColleague("Teacher2", mediator);

        PrincipalColleague principal1 = new PrincipalColleague("Principal1", mediator);
        PrincipalColleague principal2 = new PrincipalColleague("Principal2", mediator);

        mediator.addColleague(student1);
        mediator.addColleague(student2);

        mediator.addColleague(teacher1);
        mediator.addColleague(teacher2);

        mediator.addColleague(principal1);
        mediator.addColleague(principal2);

        principal1.sendMessage("Hi, everyone!");

    }
}

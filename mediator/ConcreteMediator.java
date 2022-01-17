package com.kaboomb.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {

    private List<StudentColleague> students = new ArrayList<>();
    private List<TeacherColleague> teachers = new ArrayList<>();
    private List<PrincipalColleague> pricinpals = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        if (colleague instanceof StudentColleague) {
            students.add((StudentColleague) colleague);
        } else if (colleague instanceof TeacherColleague) {
            teachers.add((TeacherColleague) colleague);
        } else if (colleague instanceof  PrincipalColleague) {
            pricinpals.add((PrincipalColleague) colleague);
        }
    }

    @Override
    void broadcast(Colleague initiator, String message) {
        if(initiator instanceof StudentColleague) {
            students.forEach(it->it.receiveMessage(message));
        } else if (initiator instanceof  TeacherColleague) {
            teachers.forEach(it->it.receiveMessage(message));
        } else {
            students.forEach(it->it.receiveMessage(message));
            teachers.forEach(it->it.receiveMessage(message));
            pricinpals.forEach(it->it.receiveMessage(message));
        }
    }
}

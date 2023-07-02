package com.zlateva;

public class Challenge {
    public static void main(String[] args) {
        final NewTutor1 tutor = new NewTutor1();
        final NewStudent1 student = new NewStudent1(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();

            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class NewTutor1 {
    private NewStudent1 student;


    public void setStudent(NewStudent1 student) {
        this.student = student;
    }

    public synchronized void studyTime() {
        System.out.println("Tutor has arrived");
        try {
            // wait for student to arrive
            this.wait();

        } catch (InterruptedException e) {

        }
        student.startStudy();
        System.out.println("Tutor is studying with student");


    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent1 {

    private NewTutor1 tutor;
    NewStudent1(NewTutor1 tutor) {
        this.tutor = tutor;
    }

    public synchronized void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        synchronized (tutor) {
            tutor.getProgressReport();

            synchronized (this) {
                System.out.println("Student handed in assignment");
                tutor.notifyAll();
            }
        }
    }
}



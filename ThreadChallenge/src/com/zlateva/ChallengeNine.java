package com.zlateva;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ChallengeNine {
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

class NewTutor {
    private NewStudent1 student;
    private Lock lock = new ReentrantLock();

    public void setStudent(NewStudent1 student) {
        this.student = student;
        lock = new ReentrantLock();
    }

    public void studyTime() {
        System.out.println("Tutor has arrived");
        if (lock.tryLock()) {
            try {
//                try {
//                    // wait for student to arrive
//                    this.wait();
//
//                } catch (InterruptedException e) {

//                }
                student.startStudy();
                System.out.println("Tutor is studying with student");
            } finally {
                lock.unlock();
            }
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent {

    private NewTutor1 tutor;

    private Lock lock = new ReentrantLock();
    NewStudent(NewTutor1 tutor) {
        this.tutor = tutor;
        lock = new ReentrantLock();
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

package com.hacker;

import com.zlateva.PersonImmutable;

public class PersonOfInterest extends PersonImmutable {
    public PersonOfInterest(PersonImmutable person) {
        super(person);
    }
//    @Override
//    public PersonImmutable[] getKids() {
//        return super.kids;
//    }
}

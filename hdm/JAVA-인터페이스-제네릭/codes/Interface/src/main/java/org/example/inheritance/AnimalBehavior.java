package org.example.inheritance;

import org.example.no_inheritance.Eatable;
import org.example.no_inheritance.Speakable;


// 다중상속 해보기 추상 메서드 물려받음
public interface AnimalBehavior extends Eatable, Speakable {

}

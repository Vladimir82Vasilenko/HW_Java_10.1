package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test // Тестирование осуществляется с граничными значениями -1,0,1,5,8,9,10, ключая классы эквивалентности
    public void notShouldSetNegativeNumStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetZeroNumStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(5);

        rad.setCurrentNumberStation(0);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSet1NumStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(5);

        rad.setCurrentNumberStation(1);

        int expected = 1;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSet8NumStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(8);

        int expected = 8;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSet9NumStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(9);

        int expected = 9;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSet10NumStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(10);

        int expected = 10;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void notShouldSet11NumStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(11);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    // "next" Проверяем граничными значениями 0,1,8,9 и серединным значением 5
    @Test
    public void NumStation0nextShould1() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(0);

        rad.next();
        int expected = 1;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumStation1nextShould2() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(1);

        rad.next();
        int expected = 2;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumStation5nextShould6() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(5);

        rad.next();
        int expected = 6;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumStation8nextShould9() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(8);

        rad.next();
        int expected = 9;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumStation9nextShould0() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(9);

        rad.next();
        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    // "prev" Проверяем граничными значениями 0,1,8,9 и серединным значением 5
    @Test
    public void NumberStation0prevShould9() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(0);

        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberStation1prevShould0() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(1);

        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberStation5prevShould4() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(5);

        rad.prev();
        int expected = 4;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberStation8prevShould7() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(8);

        rad.prev();
        int expected = 7;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberStation9prevShould8() {
        Radio rad = new Radio();

        rad.setCurrentNumberStation(9);

        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    // Тестирование осуществляется с граничными значениями -1,0,1,50,99,100,101, ключая классы эквивалентности
    @Test
    public void notShouldSetNegativeVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetZeroVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSet1Volume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSet50Volume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSet99Volume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotShouldSetAboveMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //"louder" Проверяем граничными значениями 0,1,99,100 и серединным значением 50
    @Test
    public void Volume0LouderVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.louder();
        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Volume1LouderVolume2() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        rad.louder();
        int expected = 2;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Volume50LouderVolume51() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        rad.louder();
        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Volume99LouderVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        rad.louder();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Volume100LouderVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        rad.louder();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    //"quiet" Проверяем граничными значениями 0,1,99,100 и серединным значением 50
    @Test
    void Volume0QuietVolume0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.quiet();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Volume1QuietVolume0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        rad.quiet();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Volume50QuietVolume49() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        rad.quiet();
        int expected = 49;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Volume99QuietVolume98() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        rad.quiet();
        int expected = 98;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Volume100QuietVolume99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        rad.quiet();
        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Тестирование конструктора с параметром (тестирование осуществляется с граничными значениями макс.колл-во станций-1, макс.колл-во станций+1,включая классы эквивалентности
    public void shouldSetLessMaxNumberStation() {
        Radio rad = new Radio(25);

        rad.setCurrentNumberStation(24);

        int expected = 24;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void notShouldSetMoreMaxNumberStation() {
        Radio rad = new Radio(25);

        rad.setCurrentNumberStation(26);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void notShouldSetNegativeNumStation2() {
        Radio rad = new Radio(25);

        rad.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetZeroNumStationMax25() {
        Radio rad = new Radio(25);

        rad.setCurrentNumberStation(0);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
}


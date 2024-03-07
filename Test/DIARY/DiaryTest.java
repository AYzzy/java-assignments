package DIARY;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    void testDiaryIsLocked(){
        Diary myDiary = new Diary("ayzzy","password");
        myDiary.setUnlocked("password");
        assertFalse(myDiary.isLocked());
    }
    @Test
    void createANewDiary(){
    }
    @Test
    void testThatDiaryIsActivated(){
        Diary myDiary = new Diary("ayzzy","password");
        myDiary.setLocked();
        assertTrue(myDiary.isLocked());

    }
    @Test
    void testToCreateNewEntry(){
        Diary myDiary = new Diary("ayzzy","password");
        myDiary.createEntry(1,"ayzzy","password");
        assertEquals(1,myDiary.getEntriesSize());
    }
    @Test
    void testToCreateTwoEntries(){
        Diary myDiary = new Diary("ayzzy","password");
        myDiary.createEntry(1,"title","the big boss");
        myDiary.createEntry(2,"semicolon","the best of all");
        assertEquals(2,myDiary.getEntriesSize());
    }
    @Test
    void testToCreateThreeEntries_deleteOne(){
        Diary myDiary = new Diary("ayzzy","password");
        myDiary.createEntry(1,"title","the big boss");
        myDiary.createEntry(2,"semicolon","the best of all");
        myDiary.createEntry(3,"the boy","the fix hub");
        assertEquals(3,myDiary.getEntriesSize());
        myDiary.deleteEntry(1);
        assertEquals(2, myDiary.getEntriesSize());

    }
    @Test
    void testToCreateThreeEntries_deleteTwo() {
        Diary myDiary = new Diary("ayzzy", "password");
        myDiary.createEntry(1,"title", "the big boss");
        myDiary.createEntry(2,"semicolon", "the best of all");
        myDiary.createEntry(3,"the boy", "the fix hub");
        assertEquals(3, myDiary.getEntriesSize());
        myDiary.deleteEntry(1);
        myDiary.deleteEntry(2);
        assertEquals(1, myDiary.getEntriesSize());
    }
    @Test
    void testToFindEntry(){
        Diary myDiary = new Diary("ayzzy","password");
        myDiary.createEntry(1,"title","the big boss");
        myDiary.createEntry(2,"semicolon","the best of all");
        myDiary.createEntry(3,"the boy","the fix hub");
        Entry foundEntry = myDiary.findEntry(2);
        assertEquals(foundEntry, myDiary.findEntry(2));
    }
    @Test
    void testToUpdateEntry(){
        Diary myDiary = new Diary("ayzzy","password");
        myDiary.createEntry(1,"title","the big boss");
        myDiary.createEntry(2,"semicolon","the best of all");
        myDiary.createEntry(3,"the boy","the best of the best");
        Entry updateEntry = myDiary.getUpdated(3,"the girl","she is happy");
//        myDiary.updateEntry(1,"the_boy","YOU HAVE GOT THIS");
        assertEquals(updateEntry, myDiary.getUpdated(3,"the girl","she is happy"));
    }

}
package Diary;

import org.junit.jupiter.api.Test;

class EntryTest {

    @Test
    void testThatWeCanCreateEntriesWithAllFields() {
        Entry entry = new Entry("TestTitle", "testBody");
    }
}
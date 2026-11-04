package net.edigitRest.RestApi.controller;

import net.edigitRest.RestApi.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequestMapping("/Journal")
@RestController
public class jounralEntrycontroller {
Map<Long, JournalEntry> journalEntries =new HashMap<>();
@GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
    journalEntries.put(myEntry.getId(), myEntry);
    return true;
}
}
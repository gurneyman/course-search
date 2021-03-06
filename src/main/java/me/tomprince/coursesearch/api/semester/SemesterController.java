package me.tomprince.coursesearch.api.semester;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/semesters") // This means URL's start with /demo (after Application path)
public class SemesterController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private SemesterRepository semesterRepository;


    @GetMapping
    public @ResponseBody
    Iterable<SemesterModel> getAllSemesters() {
        // This returns a JSON or XML with the users
        return semesterRepository.findAll();
    }
}
package me.tomprince.coursesearch.api.instructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/instructors") // This means URL's start with /demo (after Application path)
public class InstructorController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private InstructorRepository instructorRepository;

    @GetMapping
    public @ResponseBody
    Iterable<Instructor> getAllInstructors() {
        // This returns a JSON or XML with the users
        return instructorRepository.findAll();
    }
}
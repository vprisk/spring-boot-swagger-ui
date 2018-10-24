package com.example.demo.controller;

import com.example.demo.bean.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "学员管理API")
public class StudentController {
    @PostMapping("/student/add")
    @ApiOperation(value = "添加学员", notes = "像系统添加学生信息，传入要添加的学员对象")
    public boolean addStu(Student student) {
        return true;
    }

    @PostMapping("/student/update")
    @ApiOperation(value = "修改学员", notes = "从系统修改学生信息，传入要修改的学员对象")
    public Student updateStu(@RequestBody Student student) {
        return student;
    }
}

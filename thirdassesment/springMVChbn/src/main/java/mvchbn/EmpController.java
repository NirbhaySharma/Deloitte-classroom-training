package mvchbn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmpDao dao;
	
	@RequestMapping(value="/addemp", method=RequestMethod.GET)
	public String ShowAddEmpForm(){
		return "AddEmployee";
	}
	
	@RequestMapping(value="/addemp", method=RequestMethod.POST)
	public ModelAndView addEmp(@ModelAttribute("emp") Emp emp){
		ModelAndView mav = new ModelAndView();
		dao.addEmp(emp);
		mav.setViewName("redirect:viewemps");
		return mav;
	}
	@RequestMapping(value="/viewemps")
	public ModelAndView getEmps(){
		ModelAndView mav = new ModelAndView();
		List<Emp> list = dao.getEmps();
		mav.addObject("emp", list);
		mav.setViewName("ViewEmployee");
		return mav;
	}
	@RequestMapping(value="/updateemp", method=RequestMethod.GET)
	public ModelAndView updateEmpForm(int empno){
		Emp emp = dao.getEmp(empno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("emp", emp);
		mav.setViewName("UpdateEmployee");
		return mav;
	}
	@RequestMapping(value="/updateemp", method=RequestMethod.POST)
	public ModelAndView updateEmp(@ModelAttribute("emp") Emp emp){
		ModelAndView mav = new ModelAndView();
		dao.updateEmp(emp);
		mav.setViewName("redirect:viewemps");
		return mav;
	}
	@RequestMapping(value="/deleteemp", method=RequestMethod.GET)
	public ModelAndView deleteEmp(int empno){
		Emp emp = dao.getEmp(empno);
		ModelAndView mav = new ModelAndView();
		dao.deleteEmp(emp);
		mav.setViewName("redirect:viewemps");
		return mav;
	}
}

package scoremanager.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Teacher;
import tool.Action;

public abstract class StudentListAction extends Action {

	@Override
	public void Execute(HttpServletRequest reqeust, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();//セッション
		Teacher teacher = (Teacher)session.getAttribute("user");

		String entYearStr="";
		String classNum ="";
		String isAttendStr="";
		int entYear = 0;
		bolean isAttend = false;
		List<Student> students = null;
		LocalDate todaysDate= LocalDate.now();
		int year = todayDate.getYear();
		StudentDao sDao = new StudendDao();
		ClassNumDao cNumDao = new ClassNmDao();
		Map<String, String> errors = new HashMap<>();

		entYearStr = req.getParaameter("f1");
		classNum = req.getParameter("f2");
		isAttendStr = req.getParameter("f3");

		List<String> list = cNumDao.filter(teacher.getSchool());

		if (entYear != 0 && !classNum.equals("0")) {
			students = sDao.filter(teacher.getSchool(), entYear, classNum, isAttend);
		} else if (entYear != 0 && classNum.equals("0")) {
			students = sDao.filter(teacher.getSchool(). entYear, isAttend);
		} else if (entYear == 0 && classNum == null || entYear == 0 && classNum.equals("0")) {
			students = sDao.filter(teacher.getSchool(), isAttend);
		} else {
			errors
		}

	}
}
package com.lee.dao;

import com.lee.pojo.Department;
import com.lee.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    //模拟数据库
    private static Map<Integer, Employee> employees = null;
    //员工所属部门
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer,Employee>();

        employees.put(101,new Employee(1001,"lzw","1@qq.com",1,new Department(101,"教学部")));
        employees.put(102,new Employee(1002,"lzww","12@qq.com",0,new Department(102,"市场部")));
        employees.put(103,new Employee(1003,"lzwww","123@qq.com",0,new Department(103,"运营部")));
        employees.put(104,new Employee(1004,"lzwwww","1234@qq.com",1,new Department(104,"教研部")));
        employees.put(105,new Employee(1005,"lzwwwww","12345@qq.com",0,new Department(104,"后勤部")));
    }


    // 主键自增
    private static Integer intId = 1006;

    // 新增员工
    public void sava(Employee employee){
        if (employee.getId() == null){
            employee.setId(intId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    // 查询全部员工
    public Collection<Employee> getAll(){
        return employees.values();
    }

    // 通过id
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    // 删除
    public Employee deleteEmployeeById(Integer id){
        return employees.remove(id);
    }


}

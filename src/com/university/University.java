package com.university;

import java.util.ArrayList;

/**
 * Created by 9731021 on 4/14/2019.
 */
public class University {

	private ArrayList<Department> departments = new ArrayList<>();

    public Department[] getDepartments(){
		Department[] departmentsArray = new Department[departments.size()];
		for (int i = 0; i < departments.size(); i++)
			departmentsArray[i] = departments.get(i);
        return departmentsArray;
    }

    public void addDepartment(Department department){
		if (department != null)
			departments.add(department);
	}

    public void removeDepartment(Department department){
		if (departments.contains(department))
			departments.remove(department);
	}
}
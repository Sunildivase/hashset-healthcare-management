package com.hashsethealthcaremanagement.model;

import java.util.Objects;

public class Department {

    private int deptId;
    private String deptName;
    private int doctorId;
    private int hospitalId;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", doctorId=" + doctorId +
                ", hId=" + hospitalId +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int gethospitalId() {
        return hospitalId;
    }

    public void sethospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return getDeptId() == that.getDeptId() && getDoctorId() == that.getDoctorId() && gethospitalId() == that.gethospitalId() && Objects.equals(getDeptName(), that.getDeptName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptId(), getDeptName(), getDoctorId(), gethospitalId());
    }
}

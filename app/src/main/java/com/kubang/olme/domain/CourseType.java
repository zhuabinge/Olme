package com.kubang.olme.domain;

import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class CourseType {
    private int typeId;
    private String typeName;
    private String typePhoto;
    private String description;
    private Long totalCourseCount;   //课程总数

    public CourseType() {
        super();
    }

    public CourseType(int typeId, String typeName, String typePhoto, String description, Long totalCourseCount) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typePhoto = typePhoto;
        this.description = description;
        this.totalCourseCount = totalCourseCount;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypePhoto() {
        return typePhoto;
    }

    public void setTypePhoto(String typePhoto) {
        this.typePhoto = typePhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTotalCourseCount() {
        return totalCourseCount;
    }

    public void setTotalCourseCount(Long totalCourseCount) {
        this.totalCourseCount = totalCourseCount;
    }

   

	@Override
	public String toString() {
		return "CourseType [typeId=" + typeId + ", typeName=" + typeName
				+ ", typePhoto=" + typePhoto + ", description=" + description
				+ ", totalCourseCount=" + totalCourseCount + ", totalTime="+ "]";
	}
}

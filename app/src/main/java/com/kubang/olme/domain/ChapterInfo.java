package com.kubang.olme.domain;

/**
 * Created by Bingo on 2014/8/13.
 */
public class ChapterInfo {
    private int chapterId;
    private int courseId;
    private String chapterName;
    private Long vedioCount;

    public ChapterInfo() {
        super();
    }

    public ChapterInfo(int chapterId, int courseId, String chapterName,Long vedioCount) {
        this.chapterId = chapterId;
        this.courseId = courseId;
        this.chapterName = chapterName;
        this.vedioCount = vedioCount;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

	public Long getVedioCount() {
		return vedioCount;
	}

	public void setVedioCount(Long vedioCount) {
		this.vedioCount = vedioCount;
	}

	@Override
	public String toString() {
		return "ChapterInfo [chapterId=" + chapterId + ", courseId=" + courseId
				+ ", chapterName=" + chapterName + ",vedioCount"+vedioCount+"]";
	}
    
    
}

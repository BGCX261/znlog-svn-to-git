package pcbill.znlog.model;

import java.util.Date;

public class Article
{
	private String title;
	private String content;
	private Date date;

	public Article()
	{
		this.date = new Date();
	}	

	@Deprecated
	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setContent(String content)
	{
		this.content = content;
	}

	public String getTitle()
	{
		return title;
	}

	public String getContent()
	{
		return content;
	}

	public Date getDate()
	{
		return date;
	}
	
	
}

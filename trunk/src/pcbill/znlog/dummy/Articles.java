package pcbill.znlog.dummy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import pcbill.znlog.model.Article;

public class Articles
{
//	private List<Article> articles = new ArrayList<Article>();
	
	public static List<Article> genSomeArticles() 
	{
		List<Article> articles = new ArrayList<Article>();
		
		Article art = new Article();
		art.setTitle("開始重造輪子");
		art.setContent("為了熟悉 zk framwork 相關的用法，只好重造輪子，從頭寫個 blog 系統。因為唯有透過實做，才會印象深刻。當然，要重新定義一些需求。所以我打算不用 db 來存內容，使用 Neo4j nosql solution. 並把 source code 上傳到 google code. 而這個 blog system 我命名為 znlog. 不知道它可以成長到怎樣的地步，真期待。");
		Calendar updateDate = Calendar.getInstance();
		updateDate.set(2011, 6, 13, 18, 15, 30);
		art.setDate(updateDate.getTime());
		articles.add(art);
		
		return articles;
	}
}

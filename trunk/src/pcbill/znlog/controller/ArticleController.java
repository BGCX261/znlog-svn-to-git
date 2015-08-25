package pcbill.znlog.controller;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

import pcbill.znlog.dummy.Articles;
import pcbill.znlog.model.Article;

public class ArticleController extends GenericForwardComposer
{
	private Window articleList;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception
	{
		super.doAfterCompose(comp);
		
		List<Article> articles = Articles.genSomeArticles();
		
		for (Article art: articles)
		{
			Window window = new Window();
			window.setParent(articleList);
			
			window.setTitle(art.getTitle());
			window.setBorder("normal");
			window.setZclass("z-window-popup");
			window.setStyle("position:relative;");
			
			Label content = new Label(art.getContent());
			content.setParent(window);
//			content.setStyle("");
			
			Label dateLabel = new Label(art.getDate().toString());
			dateLabel.setParent(window);
//			dateLabel.setStyle("float:right");
			dateLabel.setStyle("position:absolute;right:4px;bottom:4px;");
		}
	}
}

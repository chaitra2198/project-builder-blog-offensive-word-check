package utility;
import model.Blog;

//interface offensivewordinterface

interface OffensiveWordsInterface
{
	boolean checkBlogTitle(Blog blog) ;
	boolean checkBlogDescription(Blog blog);
}

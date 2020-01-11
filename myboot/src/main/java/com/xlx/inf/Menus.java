package com.xlx.inf;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Menus
{

  private int menuid;
  private String mname;
  private String father;
  private String path;

  public int getMenuid()
  {
    return menuid;
  }

  public void setMenuid(int menuid)
  {
    this.menuid = menuid;
  }

  public String getMname()
  {
    return mname;
  }

  public void setMname(String mname)
  {
    this.mname = mname;
  }

  public String getFather()
  {
    return father;
  }

  public void setFather(String father)
  {
    this.father = father;
  }

  public String getPath()
  {
    return path;
  }

  public void setPath(String path)
  {
    this.path = path;
  }

  public Menus()
  {
  }

  public Menus(int menuid, String mname, String father, String path)
  {
    this.menuid = menuid;
    this.mname = mname;
    this.father = father;
    this.path = path;
  }

  @Override
  public String toString()
  {
    Gson g = new GsonBuilder().disableHtmlEscaping().create();
    return g.toJson(this);
  }
}

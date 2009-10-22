package org.fieldml.core;


public class Field {

  /** 
   * @uml.property name="mesh"
   * @uml.associationEnd inverse="field:org.fieldml.core.Mesh"
   */
  private Mesh mesh;

  /** 
   * Getter of the property <tt>mesh</tt>
   * @return  Returns the mesh.
   * @uml.property  name="mesh"
   */
  public Mesh getMesh() {
    return mesh;
  }

  /** 
   * Setter of the property <tt>mesh</tt>
   * @param mesh  The mesh to set.
   * @uml.property  name="mesh"
   */
  public void setMesh(Mesh mesh) {
    this.mesh = mesh;
  }

  /**
   * @uml.property  name="name"
   */
  private String name;

  /**
   * Getter of the property <tt>name</tt>
   * @return  Returns the name.
   * @uml.property  name="name"
   */
  public String getName() {
    return name;
  }

  /**
   * Setter of the property <tt>name</tt>
   * @param name  The name to set.
   * @uml.property  name="name"
   */
  public void setName(String name) {
    this.name = name;
  }

}

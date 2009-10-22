package org.fieldml.core;


public class Element {

  /**
   * @uml.property  name="mesh"
   * @uml.associationEnd  inverse="element:org.fieldml.core.Mesh"
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

}

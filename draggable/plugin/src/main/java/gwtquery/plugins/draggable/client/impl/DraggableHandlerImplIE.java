package gwtquery.plugins.draggable.client.impl;

import com.google.gwt.query.client.GQuery;

public class DraggableHandlerImplIE extends DraggableHandlerImpl{

  
  @Override
  public boolean resetParentOffsetPosition(GQuery helperOffsetParent) {
    return super.resetParentOffsetPosition(helperOffsetParent) || helperOffsetParent.get(0) == GQuery.document.cast();
  }

}
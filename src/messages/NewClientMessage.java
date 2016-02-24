package messages;

import com.jme3.network.AbstractMessage;
import com.jme3.network.serializing.Serializable;
import java.util.LinkedList;
import server.FieldData;

@Serializable
public class NewClientMessage extends AbstractMessage {

    public int ID;
    public String action;
    public LinkedList<FieldData> field;

    // -------------------------------------------------------------------------
    public NewClientMessage() {
    }

    // -------------------------------------------------------------------------
    public NewClientMessage(int ID, LinkedList<FieldData> playfield) {
        super();
        this.ID = ID;
        this.field = playfield;
    }

    public NewClientMessage(int ID, String action) {
        super();
        this.ID = ID;
        this.action = action;
    }
}

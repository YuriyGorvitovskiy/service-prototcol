package org.service.protocol.patch.v1;

import java.util.ArrayList;
import java.util.List;

public class JsonPatchControl_v1 extends JsonPatch_v1 {
    public List<JsonControlOp> ops = new ArrayList<>();
}

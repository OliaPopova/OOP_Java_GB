package Service;

import Data.Flow;
import Data.FlowComparator;
import Data.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlowService {
    private Flow flow;

    public void createFlow(List<StudentGroup> groups){
        this.flow = new Flow(groups);
    }

    public List<Flow> getSortedFlowsByGroupCount(List<Flow> flows){
        List<Flow> list = new ArrayList<>(flows);
        list.sort(new FlowComparator());
        return list;
    }

    public Flow getFlow() {
        return flow;
    }
}

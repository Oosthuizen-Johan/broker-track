package za.co.brokertrack.backend.entity;

import java.util.Set;

public class ClaimRequest {
    private User assignedTo;
    private Set<String> notes;
    private String status;
    private String claimId;
    private String requestor;
}

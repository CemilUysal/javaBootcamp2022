package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.FrameworkRequest;
import kodlama.io.devs.business.responses.FrameworkResponse;

import java.util.List;

public interface FrameworkService {
    List<FrameworkResponse> getall();
    FrameworkResponse add(FrameworkRequest frameworkRequest);

    void delete(FrameworkRequest frameworkRequest);
    FrameworkResponse update(FrameworkRequest frameworkRequest);

    FrameworkResponse getById(int id);
}

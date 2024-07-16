import lombok.Getter
import lombok.Setter

@Getter
@Setter
class CustomResponse<T> {
    private var status: Int

    private var data: T

    private var message: String? = null

    constructor(status: Int, data: T, message: String?) {
        this.status = status
        this.data = data
        this.message = message
    }
}
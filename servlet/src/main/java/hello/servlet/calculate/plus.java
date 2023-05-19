package hello.servlet.calculate;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;


@WebServlet(name = "plus",urlPatterns = "/plus")
public class plus extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        ServletInputStream inputStream = req.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, java.nio.charset.StandardCharsets.UTF_8);
        value value = objectMapper.readValue(messageBody, value.class);


        int n1 = Integer.parseInt(value.getNum1());
        int n2 = Integer.parseInt(value.getNum2());

        value.setResult(String.valueOf(n1+n2));
        String result = objectMapper.writeValueAsString(value);
        resp.getWriter().write(result);

    }
    }

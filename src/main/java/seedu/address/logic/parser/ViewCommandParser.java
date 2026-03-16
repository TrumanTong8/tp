package seedu.address.logic.parser;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.ViewCommand;
import seedu.address.logic.parser.exceptions.ParseException;

import static seedu.address.logic.parser.ParserUtil.parseIndex;

public class ViewCommandParser {
    public ViewCommand parse(String args) throws ParseException {
        Index index = parseIndex(args.trim());
        return new ViewCommand(index);
    }
}

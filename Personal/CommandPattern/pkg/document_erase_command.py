from pkg.command import Command


class DocumentEraseCommand(Command):
    """Remove 'text' from the document."""

    def __init__(self, document, text):
        """Constructor.

        Parameters
        ----------
        document : document.Document
            Document object/instance.
        text : str
            Text to be added to the document.
        """
        self._document = document
        self._text = text
        self._document.erase(text)

    def undo(self):
        """Add 'text' back to the document."""
        self._document.write(self._text)

    def redo(self):
        """Re-remove 'text' to the document."""
        self._document.erase(self._text)

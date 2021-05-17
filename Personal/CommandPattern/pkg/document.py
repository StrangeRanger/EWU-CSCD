class Document:
    """Document class..."""

    def __init__(self, name):
        """Constructor.

        Parameters
        ----------
        name : str
            Name of the document.
        """
        self._name = name
        self._text_array = []

    def write(self, text):
        """Add 'text' to '_text_array' (the document).

        Parameters
        ----------
        text : str
            The text to be added.
        """
        self._text_array.append(text)

    def erase(self, text):
        """Remove 'text' from '_text_array' (the document).

        Parameters
        ----------
        text : str
            The text to be removed.
        """
        self._text_array.remove(text)

    def read(self):
        """Return the content of '_text_array'.

        Returns
        -------
        txt : str
            A string comprised of all the text in '_text_array'.
        """
        txt = "------Contents of: {}------".format(self._name)

        for line in self._text_array:
            txt += "\n" + line

        return txt
